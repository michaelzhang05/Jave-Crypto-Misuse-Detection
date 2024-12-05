package kotlin.reflect.x.internal.l0.l.u1;

/* compiled from: ErrorEntity.kt */
/* loaded from: classes2.dex */
public enum b {
    ERROR_CLASS("<Error class: %s>"),
    ERROR_FUNCTION("<Error function>"),
    ERROR_SCOPE("<Error scope>"),
    ERROR_MODULE("<Error module>"),
    ERROR_PROPERTY("<Error property>"),
    ERROR_TYPE("[Error type: %s]"),
    PARENT_OF_ERROR_SCOPE("<Fake parent for error lexical scope>");

    private final String n;

    b(String str) {
        this.n = str;
    }

    public final String f() {
        return this.n;
    }
}
