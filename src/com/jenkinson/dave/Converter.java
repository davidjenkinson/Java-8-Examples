package com.jenkinson.dave;

/**
 * Created by Dave on 08/07/2016.
 */
@FunctionalInterface
interface Converter<F, T> {
    static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123

//        final int num = 1;
//        Converter<Integer, String> stringConverter =
//                (from) -> String.valueOf(from + num);
//
//        stringConverter.convert(2);     // 3
//
        int num = 1;
        Converter<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        stringConverter.convert(2);     // 3
    }

    T convert(F from);

    default T apply(F apply) {
        T x = null;
        return x;
    }
}
