package X3;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12763a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static final String f12764b = "426";

    /* renamed from: c, reason: collision with root package name */
    private static final String f12765c = "dcb428fea25c40e7b99f81ae5981ee6a";

    /* renamed from: d, reason: collision with root package name */
    private static final String f12766d = "deca87e736574c5c83c07314051fd93a";

    /* renamed from: e, reason: collision with root package name */
    private static final String f12767e = "7";

    private b() {
    }

    @Override // X3.d
    public String a() {
        return f12764b;
    }

    @Override // X3.d
    public String b() {
        return f12766d;
    }

    @Override // X3.d
    public String c() {
        long currentTimeMillis = System.currentTimeMillis();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(currentTimeMillis);
        return seconds + "." + (currentTimeMillis - TimeUnit.SECONDS.toMillis(seconds));
    }

    @Override // X3.d
    public String getKey() {
        return f12765c;
    }

    @Override // X3.d
    public String getVersion() {
        return f12767e;
    }
}
