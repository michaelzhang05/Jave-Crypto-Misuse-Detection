package androidx.room;

import c.q.a.c;
import java.io.File;

/* compiled from: SQLiteCopyOpenHelperFactory.java */
/* loaded from: classes.dex */
class p implements c.InterfaceC0077c {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final File f1696b;

    /* renamed from: c, reason: collision with root package name */
    private final c.InterfaceC0077c f1697c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(String str, File file, c.InterfaceC0077c interfaceC0077c) {
        this.a = str;
        this.f1696b = file;
        this.f1697c = interfaceC0077c;
    }

    @Override // c.q.a.c.InterfaceC0077c
    public c.q.a.c a(c.b bVar) {
        return new o(bVar.a, this.a, this.f1696b, bVar.f2894c.a, this.f1697c.a(bVar));
    }
}
