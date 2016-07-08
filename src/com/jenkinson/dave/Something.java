package com.jenkinson.dave;

class Something {
    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter = something::startsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);    // "J"
    }

    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}