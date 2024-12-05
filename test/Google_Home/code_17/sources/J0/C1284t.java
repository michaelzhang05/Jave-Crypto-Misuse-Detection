package J0;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: J0.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1284t {

    /* renamed from: a, reason: collision with root package name */
    private final String f4777a;

    /* renamed from: b, reason: collision with root package name */
    private final O0.g f4778b;

    public C1284t(String str, O0.g gVar) {
        this.f4777a = str;
        this.f4778b = gVar;
    }

    private File b() {
        return this.f4778b.g(this.f4777a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e8) {
            G0.h.f().e("Error creating marker: " + this.f4777a, e8);
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
