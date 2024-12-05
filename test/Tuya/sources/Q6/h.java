package Q6;

import L5.InterfaceC1227k;
import L5.l;
import L5.r;
import L5.x;
import M5.AbstractC1246t;
import P6.AbstractC1283i;
import P6.AbstractC1285k;
import P6.C1284j;
import P6.Q;
import P6.Z;
import g6.n;
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
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public final class h extends AbstractC1285k {

    /* renamed from: f, reason: collision with root package name */
    private static final a f8348f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final Q f8349g = Q.a.e(Q.f8001b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1227k f8350e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Q6.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0180a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            public static final C0180a f8351a = new C0180a();

            C0180a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(i entry) {
                AbstractC3159y.i(entry, "entry");
                return Boolean.valueOf(h.f8348f.c(entry.a()));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(Q q8) {
            return !n.q(q8.f(), ".class", true);
        }

        public final Q b() {
            return h.f8349g;
        }

        public final List d(ClassLoader classLoader) {
            AbstractC3159y.i(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            AbstractC3159y.h(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            AbstractC3159y.h(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL it : list) {
                a aVar = h.f8348f;
                AbstractC3159y.h(it, "it");
                r e8 = aVar.e(it);
                if (e8 != null) {
                    arrayList.add(e8);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            AbstractC3159y.h(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            AbstractC3159y.h(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL it2 : list2) {
                a aVar2 = h.f8348f;
                AbstractC3159y.h(it2, "it");
                r f8 = aVar2.f(it2);
                if (f8 != null) {
                    arrayList2.add(f8);
                }
            }
            return AbstractC1246t.G0(arrayList, arrayList2);
        }

        public final r e(URL url) {
            AbstractC3159y.i(url, "<this>");
            if (!AbstractC3159y.d(url.getProtocol(), "file")) {
                return null;
            }
            return x.a(AbstractC1285k.f8090b, Q.a.d(Q.f8001b, new File(url.toURI()), false, 1, null));
        }

        public final r f(URL url) {
            int X7;
            AbstractC3159y.i(url, "<this>");
            String url2 = url.toString();
            AbstractC3159y.h(url2, "toString()");
            if (!n.C(url2, "jar:file:", false, 2, null) || (X7 = n.X(url2, "!", 0, false, 6, null)) == -1) {
                return null;
            }
            Q.a aVar = Q.f8001b;
            String substring = url2.substring(4, X7);
            AbstractC3159y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return x.a(j.d(Q.a.d(aVar, new File(URI.create(substring)), false, 1, null), AbstractC1285k.f8090b, C0180a.f8351a), b());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ClassLoader f8352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ClassLoader classLoader) {
            super(0);
            this.f8352a = classLoader;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List invoke() {
            return h.f8348f.d(this.f8352a);
        }
    }

    public h(ClassLoader classLoader, boolean z8) {
        AbstractC3159y.i(classLoader, "classLoader");
        this.f8350e = l.b(new b(classLoader));
        if (z8) {
            p().size();
        }
    }

    private final Q o(Q q8) {
        return f8349g.k(q8, true);
    }

    private final List p() {
        return (List) this.f8350e.getValue();
    }

    private final String q(Q q8) {
        return o(q8).j(f8349g).toString();
    }

    @Override // P6.AbstractC1285k
    public void a(Q source, Q target) {
        AbstractC3159y.i(source, "source");
        AbstractC3159y.i(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // P6.AbstractC1285k
    public void d(Q dir, boolean z8) {
        AbstractC3159y.i(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // P6.AbstractC1285k
    public void f(Q path, boolean z8) {
        AbstractC3159y.i(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // P6.AbstractC1285k
    public C1284j h(Q path) {
        AbstractC3159y.i(path, "path");
        if (!f8348f.c(path)) {
            return null;
        }
        String q8 = q(path);
        for (r rVar : p()) {
            C1284j h8 = ((AbstractC1285k) rVar.a()).h(((Q) rVar.b()).l(q8));
            if (h8 != null) {
                return h8;
            }
        }
        return null;
    }

    @Override // P6.AbstractC1285k
    public AbstractC1283i i(Q file) {
        AbstractC3159y.i(file, "file");
        if (f8348f.c(file)) {
            String q8 = q(file);
            for (r rVar : p()) {
                try {
                    return ((AbstractC1285k) rVar.a()).i(((Q) rVar.b()).l(q8));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // P6.AbstractC1285k
    public AbstractC1283i k(Q file, boolean z8, boolean z9) {
        AbstractC3159y.i(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // P6.AbstractC1285k
    public Z l(Q file) {
        AbstractC3159y.i(file, "file");
        if (f8348f.c(file)) {
            String q8 = q(file);
            for (r rVar : p()) {
                try {
                    return ((AbstractC1285k) rVar.a()).l(((Q) rVar.b()).l(q8));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
