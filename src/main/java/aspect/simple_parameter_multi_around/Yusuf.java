package aspect.simple_parameter_multi_around;

import org.springframework.stereotype.Component;

@Component
public class Yusuf implements Performance {

    @Override
    public void perform(String name, int count) {
        System.out.printf("Performer is %s.\nWill be performed %d times\n\n", name, count);
        for (int i = 0; i < count; i++) {
            System.out.println("Daglar ile taslar ile");
            System.out.println("Cagirayim Mevlam seni");
            System.out.println("Seherlerde kuslar ile");
            System.out.println("Cagirayim Mevlam seni");
            System.out.println("\n---\n\n");
        }
    }
}
