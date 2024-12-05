package F7;

import java.security.spec.KeySpec;
import s7.C4020a;

/* loaded from: classes5.dex */
public class a implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f2867a;

    /* renamed from: b, reason: collision with root package name */
    private short[] f2868b;

    /* renamed from: c, reason: collision with root package name */
    private short[][] f2869c;

    /* renamed from: d, reason: collision with root package name */
    private short[] f2870d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f2871e;

    /* renamed from: f, reason: collision with root package name */
    private C4020a[] f2872f;

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C4020a[] c4020aArr) {
        this.f2867a = sArr;
        this.f2868b = sArr2;
        this.f2869c = sArr3;
        this.f2870d = sArr4;
        this.f2871e = iArr;
        this.f2872f = c4020aArr;
    }

    public short[] a() {
        return this.f2868b;
    }

    public short[] b() {
        return this.f2870d;
    }

    public short[][] c() {
        return this.f2867a;
    }

    public short[][] d() {
        return this.f2869c;
    }

    public C4020a[] e() {
        return this.f2872f;
    }

    public int[] f() {
        return this.f2871e;
    }
}
