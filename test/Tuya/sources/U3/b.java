package U3;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f11092a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f11093b = "426";

    /* renamed from: c, reason: collision with root package name */
    private static final String f11094c = "dcb428fea25c40e7b99f81ae5981ee6a";

    /* renamed from: d, reason: collision with root package name */
    private static final String f11095d = "deca87e736574c5c83c07314051fd93a";

    /* renamed from: e, reason: collision with root package name */
    private static final String f11096e = "7";

    private b() {
    }

    @Override // U3.d
    public String a() {
        return f11093b;
    }

    @Override // U3.d
    public String b() {
        return f11095d;
    }

    @Override // U3.d
    public String c() {
        long currentTimeMillis = System.currentTimeMillis();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
        return seconds + "." + (currentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
    }

    @Override // U3.d
    public String getKey() {
        return f11094c;
    }

    @Override // U3.d
    public String getVersion() {
        return f11096e;
    }
}
