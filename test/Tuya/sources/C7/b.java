package C7;

import java.security.spec.KeySpec;

/* loaded from: classes5.dex */
public class b implements KeySpec {

    /* renamed from: a, reason: collision with root package name */
    private short[][] f1363a;

    /* renamed from: b, reason: collision with root package name */
    private short[][] f1364b;

    /* renamed from: c, reason: collision with root package name */
    private short[] f1365c;

    /* renamed from: d, reason: collision with root package name */
    private int f1366d;

    public b(int i8, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f1366d = i8;
        this.f1363a = sArr;
        this.f1364b = sArr2;
        this.f1365c = sArr3;
    }

    public short[][] a() {
        return this.f1363a;
    }

    public short[] b() {
        return this.f1365c;
    }

    public short[][] c() {
        return this.f1364b;
    }

    public int d() {
        return this.f1366d;
    }
}
