package z6;

import M5.C1238k;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: z6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4046f {

    /* renamed from: a, reason: collision with root package name */
    private final C1238k f40556a = new C1238k();

    /* renamed from: b, reason: collision with root package name */
    private int f40557b;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(char[] array) {
        int i8;
        AbstractC3159y.i(array, "array");
        synchronized (this) {
            try {
                int length = this.f40557b + array.length;
                i8 = AbstractC4044d.f40554a;
                if (length < i8) {
                    this.f40557b += array.length;
                    this.f40556a.g(array);
                }
                L5.I i9 = L5.I.f6487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final char[] b(int i8) {
        char[] cArr;
        synchronized (this) {
            cArr = (char[]) this.f40556a.A();
            if (cArr != null) {
                this.f40557b -= cArr.length;
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
