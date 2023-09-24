package Section4_DataTypesNullReferences;

public class NullReferences {
    public static void main(String[] args) {
        String str = null;
        str.toLowerCase();//<=------- null piinter exceptoin

//        if (bankBranch != null) {
//            Address address = bankBranch.getAddress();
//            if (address != null) {
//                Country country = address.getCountry();
//                if (country != null) {
//                    String countryCode = country.getCountryCode();
//                }
//            }
//        }
    }
}
