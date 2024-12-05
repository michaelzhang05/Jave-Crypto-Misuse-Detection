package C7;

import java.security.spec.KeySpec;
import p7.C3626a;

/* loaded from: classes5.dex */
public class a implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f1357a;

    /* renamed from: b, reason: collision with root package name */
    private short[] f1358b;

    /* renamed from: c, reason: collision with root package name */
    private short[][] f1359c;

    /* renamed from: d, reason: collision with root package name */
    private short[] f1360d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f1361e;

    /* renamed from: f, reason: collision with root package name */
    private C3626a[] f1362f;

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, C3626a[] c3626aArr) {
        this.f1357a = sArr;
        this.f1358b = sArr2;
        this.f1359c = sArr3;
        this.f1360d = sArr4;
        this.f1361e = iArr;
        this.f1362f = c3626aArr;
    }

    public short[] a() {
        return this.f1358b;
    }

    public short[] b() {
        return this.f1360d;
    }

    public short[][] c() {
        return this.f1357a;
    }

    public short[][] d() {
        return this.f1359c;
    }

    public C3626a[] e() {
        return this.f1362f;
    }

    public int[] f() {
        return this.f1361e;
    }
}
