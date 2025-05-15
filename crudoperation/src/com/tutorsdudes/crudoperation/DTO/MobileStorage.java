package com.tutorsdudes.crudoperation.DTO;

public class MobileStorage {

    MobileDto[] mobile = new MobileDto[10];


    public boolean saveValue(MobileDto mobileDto) {
        if (mobileDto != null) {
            if (mobileDto.getProcessor() != null && mobileDto.getProcessor().length() >= 5) {


                for (int i = 0; i < mobile.length; i++) {
                    if (mobile[i] == null) {
                        System.out.println("Saved mobile: " + mobileDto);
                        mobile[i] = mobileDto;
                        return true;
                    }

                }
                System.out.println("storage is full");
                return false;

            }
            System.out.println("Invalid processor name");
            return false;

        }
        System.out.println("mobileDto is null");
        return false;

    }

    public MobileDto[] readAll() {
        return mobile;
    }

    public MobileDto findBrand(String brand) {
        if (brand != null && brand.length() <= 5) {
            for (int i = 0; i < mobile.length; i++) {
                if (mobile[i] != null) {
                    if (mobile[i].getBrandName().equals(brand)) {
                        return mobile[i]; // Brand matched
                    }
                }

            }
            System.out.println("Given brand value is not present.");
            return null;
        }
        System.out.println("Brand value is null or exceeds length limit.");
        return null;
    }

}



