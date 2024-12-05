package p;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class j extends e implements i {

    /* renamed from: w0, reason: collision with root package name */
    public e[] f8731w0 = new e[4];

    /* renamed from: x0, reason: collision with root package name */
    public int f8732x0 = 0;

    @Override // p.i
    public void a() {
        this.f8732x0 = 0;
        Arrays.fill(this.f8731w0, (Object) null);
    }

    @Override // p.i
    public void b(f fVar) {
    }

    @Override // p.i
    public void c(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i6 = this.f8732x0 + 1;
        e[] eVarArr = this.f8731w0;
        if (i6 > eVarArr.length) {
            this.f8731w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f8731w0;
        int i7 = this.f8732x0;
        eVarArr2[i7] = eVar;
        this.f8732x0 = i7 + 1;
    }
}
