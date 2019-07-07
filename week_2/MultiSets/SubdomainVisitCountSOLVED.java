package week_2.MultiSets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SOLVED
 */
public class SubdomainVisitCountSOLVED {
    public List<String> subdomainVisits(String[] cpdomains) {
        //load all of the subdomains by searching through every domain from end to front
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb;
        for(String str : cpdomains) {
            sb = new StringBuilder();
            String[] countAndDomains = str.split(" ");
            Integer count = Integer.parseInt(countAndDomains[0]);
            String domain = countAndDomains[1];
            String[] domains = domain.split("\\.");
            for(int i = domains.length - 1; i >= 0; i--) {
                if(i == domains.length - 1) {
                    sb.append(domains[i]);
                } else {
                    sb.insert(0,(domains[i] + "."));
                }

                if(!map.containsKey(sb.toString())) {
                    map.put(sb.toString(), count);
                } else {
                    Integer newCount = map.get(sb.toString()) + count;
                    map.put(sb.toString(), newCount);
                }
            }
        }

        //add all of the final subdomains and counts into a list
        List<List<String>> finalList = new ArrayList<>();
        finalList.add(new ArrayList<>());
        map.forEach((domain, count) -> {
            finalList.get(0).add(count + " " + domain);
        });

        return finalList.get(0);
    }
}
