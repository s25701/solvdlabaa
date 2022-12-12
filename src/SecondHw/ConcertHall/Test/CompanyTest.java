package SecondHw.ConcertHall.Test;

import SecondHw.ConcertHall.Company;
import SecondHw.ConcertHall.Exception.InvalidCompanyException;

class CompanyTest {
    public static void main(String[] args) throws InvalidCompanyException {

        Company company1 = new Company("FF", "Japonska LTD");
        System.out.println(company1);

        Company company2 = new Company("KK", "NusrEt LTD");
        System.out.println("\n" + company2 + "\n");

        //test getters
        System.out.println(company2.getCompanyId());
        System.out.println(company2.getCompanyName());
        Company.companyIsSponsoring(company1);
        System.out.println(company1.manyThanks());
        Company.thereIsCompany();
        company1.staticDisplayCompanyInformation();
    }
}
