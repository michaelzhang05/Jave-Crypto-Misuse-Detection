package T6;

import O5.InterfaceC1355k;
import O5.l;
import O5.r;
import O5.x;
import P5.AbstractC1378t;
import S6.AbstractC1421i;
import S6.AbstractC1423k;
import S6.C1422j;
import S6.Q;
import S6.Z;
import j6.n;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public final class h extends AbstractC1423k {

    /* renamed from: f, reason: collision with root package name */
    private static final a f10145f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Q f10146g = Q.a.e(Q.f9832b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1355k f10147e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: T6.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0206a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0206a f10148a = new C0206a();

            C0206a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(i entry) {
                AbstractC3255y.i(entry, "entry");
                return Boolean.valueOf(h.f10145f.c(entry.a()));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(Q q8) {
            return !n.q(q8.f(), ".class", true);
        }

        public final Q b() {
            return h.f10146g;
        }

        public final List d(ClassLoader classLoader) {
            AbstractC3255y.i(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            AbstractC3255y.h(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            AbstractC3255y.h(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL it : list) {
                a aVar = h.f10145f;
                AbstractC3255y.h(it, "it");
                r e8 = aVar.e(it);
                if (e8 != null) {
                    arrayList.add(e8);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            AbstractC3255y.h(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            AbstractC3255y.h(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL it2 : list2) {
                a aVar2 = h.f10145f;
                AbstractC3255y.h(it2, "it");
                r f8 = aVar2.f(it2);
                if (f8 != null) {
                    arrayList2.add(f8);
                }
            }
            return AbstractC1378t.G0(arrayList, arrayList2);
        }

        public final r e(URL url) {
            AbstractC3255y.i(url, "<this>");
            if (!AbstractC3255y.d(url.getProtocol(), "file")) {
                return null;
            }
            return x.a(AbstractC1423k.f9921b, Q.a.d(Q.f9832b, new File(url.toURI()), false, 1, null));
        }

        public final r f(URL url) {
            int X7;
            AbstractC3255y.i(url, "<this>");
            String url2 = url.toString();
            AbstractC3255y.h(url2, "toString()");
            if (!n.C(url2, "jar:file:", false, 2, null) || (X7 = n.X(url2, "!", 0, false, 6, null)) == -1) {
                return null;
            }
            Q.a aVar = Q.f9832b;
            String substring = url2.substring(4, X7);
            AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return x.a(j.d(Q.a.d(aVar, new File(URI.create(substring)), false, 1, null), AbstractC1423k.f9921b, C0206a.f10148a), b());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f10149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f10149a = classLoader;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            return h.f10145f.d(this.f10149a);
        }
    }

    public h(ClassLoader classLoader, boolean z8) {
        AbstractC3255y.i(classLoader, "classLoader");
        this.f10147e = l.b(new b(classLoader));
        if (z8) {
            p().size();
        }
    }

    private final Q o(Q q8) {
        return f10146g.k(q8, true);
    }

    private final List p() {
        return (List) this.f10147e.getValue();
    }

    private final String q(Q q8) {
        return o(q8).j(f10146g).toString();
    }

    @Override // S6.AbstractC1423k
    public void a(Q source, Q target) {
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // S6.AbstractC1423k
    public void d(Q dir, boolean z8) {
        AbstractC3255y.i(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // S6.AbstractC1423k
    public void f(Q path, boolean z8) {
        AbstractC3255y.i(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // S6.AbstractC1423k
    public C1422j h(Q path) {
        AbstractC3255y.i(path, "path");
        if (!f10145f.c(path)) {
            return null;
        }
        String q8 = q(path);
        for (r rVar : p()) {
            C1422j h8 = ((AbstractC1423k) rVar.a()).h(((Q) rVar.b()).l(q8));
            if (h8 != null) {
                return h8;
            }
        }
        return null;
    }

    @Override // S6.AbstractC1423k
    public AbstractC1421i i(Q file) {
        AbstractC3255y.i(file, "file");
        if (f10145f.c(file)) {
            String q8 = q(file);
            for (r rVar : p()) {
                try {
                    return ((AbstractC1423k) rVar.a()).i(((Q) rVar.b()).l(q8));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // S6.AbstractC1423k
    public AbstractC1421i k(Q file, boolean z8, boolean z9) {
        AbstractC3255y.i(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // S6.AbstractC1423k
    public Z l(Q file) {
        AbstractC3255y.i(file, "file");
        if (f10145f.c(file)) {
            String q8 = q(file);
            for (r rVar : p()) {
                try {
                    return ((AbstractC1423k) rVar.a()).l(((Q) rVar.b()).l(q8));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
