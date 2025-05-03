package com.tutorsdudes.crudoperation.DTO;

public class MobileStorage {

    MobileDto[] mobile = new MobileDto[10];


    public boolean saveValue(MobileDto mobileDto) {
        if (mobileDto != null) {
            if (mobileDto.getBrandName() != null && mobileDto.getBrandName().length() >= 4) {
                if (mobileDto.getProcessor() != null && mobileDto.getProcessor().length() >= 5) {
                    for (int i = 0; i < mobile.length; i++) {
                        if (mobile[i] == null) {
                            System.out.println("Saved mobile: " + mobileDto);
                            mobile[i] = mobileDto;
                            return true;
                        }
                    }
                    System.out.println("Storage is full");
                    return false;


                }
                System.out.println("Invalid processor name");
                return false;

            }

            System.out.println("invalid brand name");
            return false;
        }
        System.out.println("MobileDto is null");
        return false;
    }

}
