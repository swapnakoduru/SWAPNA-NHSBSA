package base;

import java.util.HashMap;

public class PageUrls {
        private static HashMap<String,String> pageURLs=new HashMap<>();
        private static void setPageURLs(){

                pageURLs.put("Landing Page","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
                pageURLs.put("Which country do you live in","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/where-you-live");
                pageURLs.put("Is your GP practice in Scotland or Wales?","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/gp-in-scotland-or-wales");
                pageURLs.put("Which country is your dental practice in?","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/dental-practice-country");
                pageURLs.put("What is your date of birth?","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/date-of-birth");
                pageURLs.put("Do you live with a partner?","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/partner");
                pageURLs.put("Do you or your partner claim any benefits or tax credits?","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits");
                pageURLs.put("Universal Credit","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/paid-universal-credit");
                pageURLs.put("joint Universal Credit","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-claim");
                pageURLs.put("take-home pay of £935","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/universal-credit-take-home-pay");
                pageURLs.put("Are you pregnant","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/pregnant-or-given-birth");
                pageURLs.put("Do you have an injury  by serving in armed forces?","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/war-pensioner");
                pageURLs.put("Do you have diabetes","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/diabetes");
                pageURLs.put("Do you claim any benefits or tax credits?","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/claim-benefits-tax-credits");
                pageURLs.put("Do you need to take medication","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/diabetes-medication");
                pageURLs.put("Do you live permanently in a care home?","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/care-home");
                pageURLs.put("Do you get help from local council","https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/local-council-assessed");
        }
        public static String getPageUrl(String pageName){
                setPageURLs();
                return pageURLs.get(pageName);
        }



}
