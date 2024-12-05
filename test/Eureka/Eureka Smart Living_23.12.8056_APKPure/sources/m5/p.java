package m5;

/* loaded from: classes.dex */
public abstract class p {
    public static boolean a(org.apache.cordova.b bVar, String str) {
        return bVar.f8371cordova.hasPermission(str);
    }

    public static void b(org.apache.cordova.b bVar, int i6, String str) {
        c(bVar, i6, new String[]{str});
    }

    public static void c(org.apache.cordova.b bVar, int i6, String[] strArr) {
        bVar.f8371cordova.requestPermissions(bVar, i6, strArr);
    }
}
