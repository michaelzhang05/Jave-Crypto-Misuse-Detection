package F7;

import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class b implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f2873a;

    /* renamed from: b, reason: collision with root package name */
    private short[][] f2874b;

    /* renamed from: c, reason: collision with root package name */
    private short[] f2875c;

    /* renamed from: d, reason: collision with root package name */
    private int f2876d;

    public b(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f2876d = i8;
        this.f2873a = sArr;
        this.f2874b = sArr2;
        this.f2875c = sArr3;
    }

    public short[][] a() {
        return this.f2873a;
    }

    public short[] b() {
        return this.f2875c;
    }

    public short[][] c() {
        return this.f2874b;
    }

    public int d() {
        return this.f2876d;
    }
}
