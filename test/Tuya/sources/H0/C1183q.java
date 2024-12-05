package H0;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: H0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1183q {

    /* renamed from: a, reason: collision with root package name */
    private final String f3393a;

    /* renamed from: b, reason: collision with root package name */
    private final M0.f f3394b;

    public C1183q(String str, M0.f fVar) {
        this.f3393a = str;
        this.f3394b = fVar;
    }

    private File b() {
        return this.f3394b.e(this.f3393a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e8) {
            E0.f.f().e("Error creating marker: " + this.f3393a, e8);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
