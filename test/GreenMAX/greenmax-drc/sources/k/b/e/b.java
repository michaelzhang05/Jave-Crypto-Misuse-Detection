package k.b.e;

/* compiled from: Level.java */
/* loaded from: classes2.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    private int l;
    private String m;

    b(int i2, String str) {
        this.l = i2;
        this.m = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.m;
    }
}
