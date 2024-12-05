package f5;

/* loaded from: classes.dex */
public class k {
    public h5.a a(Class cls) {
        return new d(cls);
    }

    public String b(g gVar) {
        String obj = gVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String c(i iVar) {
        return b(iVar);
    }
}
