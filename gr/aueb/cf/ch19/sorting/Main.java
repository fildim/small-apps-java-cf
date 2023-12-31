package gr.aueb.cf.ch19.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5),
                new Product("Honey", 12.5, 115),
                new Product("Apples", 5.5, 8),
                new Product("Apples", 3.5, 25)));

        List<Product> newProducts = Arrays.asList(              //structurally unmodifiable
                new Product("Oranges", 8.5, 10),
                new Product("Milk", 2.5, 5),
                new Product("Honey", 12.5, 115),
                new Product("Apples", 5.5, 8),
                new Product("Apples", 3.5, 25));

        List<String> productDescriptions = products.stream()
                .filter(p -> p.getQuantity() >= 1)
                .map(Product::getDescription)
                .sorted()
                .collect(Collectors.toList());



        Set<String> cities = new HashSet<>(List.of("Athens", "Berlin", "Moscow"));

        Set<String> nonGreekCities = cities.stream()
                .filter(city -> !city.equals("Athens"))
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        List<Product> updatedProductPrices = products.stream()
                .map(p -> new Product(p.getDescription(), p.getPrice() + p.getPrice() * 0.10, p.getQuantity()))
                .collect(Collectors.toList());

        int sumOfQuantities = products.stream()
                 .filter(p -> p.getDescription().equals("Apples"))
                 .reduce(0, (total, e) -> total + e.getQuantity(), Integer::sum);

        int sumOfQuantities2 = products.stream()
                .filter(p -> p.getDescription().equals("Apples"))
                .mapToInt(Product::getQuantity)
                .sum();

        Collections.sort(products);
        products.forEach(System.out::println);

        Collections.reverse(products);
        products.forEach(System.out::println);

        Collections.sort(products, Comparator.naturalOrder());
        products.sort(Comparator.naturalOrder());       //same as above

        products.sort(Comparator.reverseOrder());       //descending order

        products.sort(Comparator.comparing(Product::getDescription));
        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getQuantity).reversed());

        products.sort(Comparator.comparing(Product::getDescription)         //ascending description
                .thenComparing(Product::getPrice, (a1, a2) -> Double.compare(a2, a1))       //descending price
                .thenComparing(Product::getQuantity));              //ascending quantity

        List<Product> lengthFiltered = products.stream()        //toString
                .filter(product -> product.getDescription().length() <= 5)      //filter
                .collect(Collectors.toList());          //toList

        lengthFiltered.forEach(System.out::println);

        List<Product> applesList = products.stream()
                .filter(product -> product.getDescription().equals("Apples"))
                .sorted(Comparator.comparing(Product::getQuantity))
                .collect(Collectors.toList());

        applesList.forEach(System.out::println);




    }
}
