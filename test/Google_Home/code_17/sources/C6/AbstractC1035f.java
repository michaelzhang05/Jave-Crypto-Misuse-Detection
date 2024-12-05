package C6;

import P5.C1370k;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: C6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1035f {

    /* renamed from: a, reason: collision with root package name */
    private final C1370k f1674a = new C1370k();

    /* renamed from: b, reason: collision with root package name */
    private int f1675b;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(char[] array) {
        int i8;
        AbstractC3255y.i(array, "array");
        synchronized (this) {
            try {
                int length = this.f1675b + array.length;
                i8 = AbstractC1033d.f1672a;
                if (length < i8) {
                    this.f1675b += array.length;
                    this.f1674a.e(array);
                }
                O5.I i9 = O5.I.f8278a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final char[] b(int i8) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f1674a.z();
            if (cArr != null) {
                this.f1675b -= cArr.length;
            } else {
                cArr = null;
            }
        }
        if (cArr == null) {
            return new char[i8];
        }
        return cArr;
    }
}
