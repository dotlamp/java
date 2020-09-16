package ch7_나머지주요구성요소.a15_Abstact_추상클래스.interface_.IronMan;

public class IronMan implements Heroable {

    int weaponDamage = 100;


    @Override
    public int fire() {
        System.out.printf("빔 발사! : %d 만큼의 데미지를 가함 \n", weaponDamage);
        return this.weaponDamage;
    }

    @Override
    public void changeShape(boolean isHeroMode) {
        if(isHeroMode){
            System.out.println("장갑 장착");
        }else{
            System.out.println("장갑 제거");
        }
    }

    @Override
    public void upgrade() {
        int before = weaponDamage;
        weaponDamage += weaponDamage * 0.1;
        System.out.printf("무기 성능 개선 : %d --> %d\n", before, weaponDamage);
    }
}
