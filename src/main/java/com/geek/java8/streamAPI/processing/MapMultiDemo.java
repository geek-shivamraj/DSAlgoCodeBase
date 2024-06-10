package com.geek.java8.streamAPI.processing;

import com.geek.java8.streamAPI.processing.models.Album;
import com.geek.java8.streamAPI.processing.models.Artist;
import com.geek.java8.streamAPI.processing.models.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

public class MapMultiDemo {
    public static void main(String[] args) {

        // mapMulti implementation is more direct since we don't need to invoke so many intermediate operations.
        // mapMulti implementation is imperative, giving us more freedom to do element transformation.
        // To support int, long, double primitive types, we have mapMultiToDouble, mapMultiToInt,
        // & mapMultiToLong variations of mapMulti
        mapMultiBasic();
        mapMultiToDoubleBasic();
        mapMultiToPojo();
    }

    private static void mapMultiToPojo() {
//        List<Artist> artists = Arrays.asList(new Artist("art1", ))
//        List<Album> albums = Arrays.asList(new Album("album1", 120, ))
//        List<Pair<String, String>> artistAlbum = alb
    }


    private static void mapMultiToDoubleBasic() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        double percentage = .01;

        double sum = integers.stream().mapMultiToDouble((integer, consumer) -> {
            if (integer % 2 == 0) {
                consumer.accept(integer * (1 + percentage));
            }
        }).sum();
        System.out.println("Sum: " + sum);
    }

    private static void mapMultiBasic() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        double percentage = 0.01;
        List<Double> evenDoubles = integers.stream().<Double>mapMulti((i, consumer) -> {
            if(i % 2 == 0) {
                consumer.accept((double) i * (1 + percentage));
            }
        }).collect(Collectors.toList());
        System.out.println(evenDoubles);

        List<Double> evenDoubles1 = integers.stream().map(i -> {
            double result = 0.0;
            if(i % 2 == 0)
                result = i * (1 + percentage);
            return result;
        }).collect(Collectors.toList());
        System.out.println(evenDoubles1);

        List<Double> evenDoubles2 = integers.stream()
                .filter(i -> i%2 == 0)
                .map(i -> (double)i * (1 + percentage)).collect(Collectors.toList());
        System.out.println(evenDoubles2);
    }
}
