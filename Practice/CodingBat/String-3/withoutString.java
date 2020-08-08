public class withoutString {

    public String withoutString(String base, String remove) {
        if (remove.length() == 1) {
            String result = "";
            for (int i = 0; i < base.length(); i++) {
                if (Character.toLowerCase(base.charAt(i)) != Character.toLowerCase(remove.charAt(0))) {
                    result = result + base.charAt(i);
                }
            }
            return result;
        }
        else
        {

            int rem_len=remove.length();
            while(base.toLowerCase().contains(remove.toLowerCase()))
            {
                base = base.substring(0,base.toLowerCase().indexOf(remove.toLowerCase())) + base.substring(base.toLowerCase().indexOf(remove.toLowerCase())+rem_len,base.length());

            }
            return base;
        }

    }

    }

