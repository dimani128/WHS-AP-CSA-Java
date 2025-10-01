package org.unit1.ch_17_115;

public class fun_with_name {
    public static void main(String[] args) {
        String name = "This is a NAME wow so cool and AMAZING";

        String huh = "";
        for (int i = 0; i < name.length(); i++)
            huh += name.substring(name.length() - i - 1) + '\n';

        String sorted = name;
        boolean exit = false;
        while (!exit)
        {
            exit = true;
            for (int i = 0; i < (sorted.length()) - 1; i++)
            {
                if (String.valueOf(sorted.charAt(i)).compareTo(String.valueOf(sorted.charAt(i + 1))) > 0)
                {
                    exit = false;
                    sorted = sorted.substring(0, i) + sorted.charAt(i + 1) + sorted.charAt(i) + sorted.substring(i + 2);
                }
            }
        }

        String backwards = "";
        for (int i = 0; i < name.length(); i++)
            backwards += name.charAt(name.length() - i - 1);

        String dissapearingRecord = "";
        String dissapearing = name;
        String underscores = new String(new char[dissapearing.length()]).replace('\0', '_');

        while (!dissapearing.equals(underscores)) {
            dissapearingRecord += dissapearing + '\n';

            // find the last non-'_' index
            int idx = dissapearing.lastIndexOf('_') == dissapearing.length() - 1
                    ? dissapearing.lastIndexOf('_') - 1
                    : dissapearing.length() - 1;

            // actually find last non-underscore safely
            while (idx >= 0 && dissapearing.charAt(idx) == '_') {
                idx--;
            }

            if (idx < 0) break; // all underscores already

            char target = dissapearing.charAt(idx);
            dissapearing = dissapearing.replace(target, '_');
        }

        dissapearingRecord += dissapearing;

        System.out.println(name);
        System.out.println(huh);
        System.out.println(sorted);
        System.out.println(backwards);
        System.out.println(backwards.toLowerCase());
        System.out.println(backwards.toUpperCase());
        System.out.println(dissapearingRecord);
    }
}
