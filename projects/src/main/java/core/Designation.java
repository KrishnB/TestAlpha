package core;

/**
 * Created by tvserver on 19/10/16.
 */
public enum Designation {
    SDET(1,2,3,4,5,6,7),
    QA(1),
    MANAGER(1),
    NETWORKADMIN(1);

    int[] designationCode;
    Designation(int... designationCode) {
        this.designationCode = designationCode;
    }
}
