import java.text.Format;

public class Koans
{
    public static String greeting(String name)
    {
        String greeting = "Hello, " + name + ".";
        return greeting;
    }

    public static String greeting2(String name)
    {
        if (name != null)
        {
            return greeting(name);
        } else
        {
            return "Hello, my friend.";
        }
    }

    public static String greeting3(String name)
    {

        if (name.equals(name.toUpperCase()))
        {
            return "HELLO " + name + "!";
        }
        return greeting2(name);
    }

    public static String greeting4(String name)
    {
        return greeting3(name);
    }
    public static String greeting4(String[] names)
    {
        if (names.length == 2)
        {
            return String.format("Hello, %s and %s.", names[0], names[1]);
        }
        return greeting3(String.valueOf(names));
    }

    public static String greeting5(String[] names)
    {
        if (names.length > 2)
        {
            String[] notLastName = new String[names.length-1];
            String lastName = names[names.length-1];
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < names.length - 1; i++)
            {
                notLastName[i] = names[i];
            }

            for (String s : notLastName)
            {
                sb.append(s).append(", ");
            }

        return String.format("Hello, %sand %s.", sb, lastName);

        }

        return greeting4(names);
    }

    public static String greeting6(String[] names)
    {
        boolean containsUpperCaseName = false;
        int upperCaseNameCounter = 0;
        int lowerCaseNameCounter = 0;
        String lastLowerCaseName = "";
        String lastUpperCaseName = "";
        StringBuilder lowerCaseNameString1 = new StringBuilder();
        StringBuilder upperCaseNameString1 = new StringBuilder();



        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equals(names[i].toUpperCase()))
            {
                containsUpperCaseName = true;
                upperCaseNameCounter ++;
            }
        }

        String [] lowerCaseNames = new String[names.length - upperCaseNameCounter];
        String [] lowerCaseNamesCopy = new String[lowerCaseNames.length-1];
        String [] upperCaseNames = new String[upperCaseNameCounter];
        String [] upperCaseNamesCopy = new String[upperCaseNames.length-1];

        if (containsUpperCaseName)
        {

            upperCaseNameCounter = 0;

            for (int i = 0; i < names.length; i++)
            {
                if (names[i].equals(names[i].toUpperCase()))
                {
                    upperCaseNames[upperCaseNameCounter] = names[i];
                    upperCaseNameCounter ++;
                } else
                {
                    lowerCaseNames[lowerCaseNameCounter] = names[i];
                    lowerCaseNameCounter ++;
                }
            }

        } else greeting5(names);

        lastLowerCaseName = lowerCaseNames[lowerCaseNames.length-1];
        lastUpperCaseName = upperCaseNames[upperCaseNames.length-1];

        if (lowerCaseNameCounter > 2)
        {
            lastLowerCaseName = lowerCaseNames[lowerCaseNames.length-1];
            for (int i = 0; i < lowerCaseNames.length - 1; i++) {
                lowerCaseNamesCopy[i] = lowerCaseNames[i];
            }
            for (String s : lowerCaseNamesCopy)
            {
                lowerCaseNameString1.append(s + ", ");
            }
        } else
        {
            lowerCaseNameString1.append(lowerCaseNames[0] + " ");
        }


        if (upperCaseNameCounter > 2)
        {

            for (int i = 0; i < upperCaseNames.length - 1; i++) {
                upperCaseNamesCopy[i] = upperCaseNames[i];
            }
            for (String s : upperCaseNames)
            {
                upperCaseNameString1.append(s).append(" AND ");
            }
        }

        return String.format("Hello, %sand %s. AND HELLO %s%s!", lowerCaseNameString1, lastLowerCaseName, upperCaseNameString1, lastUpperCaseName);
    }




}
