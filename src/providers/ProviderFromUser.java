package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProviderFromUser implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int num = Integer.parseInt(s);

        List<Integer> providerList = new ArrayList<Integer>();
        for(int y = 0; y < num; y++){
            String sowmthing = scan.next();
            int num2 = Integer.parseInt(sowmthing);

            providerList.add(num2);
        }

        return providerList;
    }
}

