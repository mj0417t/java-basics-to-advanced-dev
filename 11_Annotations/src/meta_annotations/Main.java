package meta_annotations;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ChildClass().getClass().getAnnotations()));

        Category[] categoryAnnotationsArray = new Eagle().getClass().getAnnotationsByType(Category.class);
        for (Category cat: categoryAnnotationsArray)
            System.out.println(cat.name());
    }
}
