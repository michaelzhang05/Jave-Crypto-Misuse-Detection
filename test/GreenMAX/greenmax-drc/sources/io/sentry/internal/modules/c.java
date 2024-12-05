package io.sentry.internal.modules;

import io.sentry.s4;
import io.sentry.util.h;
import io.sentry.w1;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ManifestModulesLoader.java */
@ApiStatus.Internal
@ApiStatus.Experimental
/* loaded from: classes2.dex */
public final class c extends d {

    /* renamed from: d, reason: collision with root package name */
    private final Pattern f18971d;

    /* renamed from: e, reason: collision with root package name */
    private final Pattern f18972e;

    /* renamed from: f, reason: collision with root package name */
    private final ClassLoader f18973f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManifestModulesLoader.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18974b;

        public a(String str, String str2) {
            this.a = str;
            this.f18974b = str2;
        }
    }

    public c(w1 w1Var) {
        this(c.class.getClassLoader(), w1Var);
    }

    private a d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f18972e.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            return new a(matcher.group(1), matcher.group(2));
        }
        return null;
    }

    private List<a> e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f18973f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a d2 = d(f(resources.nextElement()));
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
        } catch (Throwable th) {
            this.f18975b.b(s4.ERROR, "Unable to detect modules via manifest files.", th);
        }
        return arrayList;
    }

    private String f(URL url) {
        Matcher matcher = this.f18971d.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (a aVar : e()) {
            hashMap.put(aVar.a, aVar.f18974b);
        }
        return hashMap;
    }

    c(ClassLoader classLoader, w1 w1Var) {
        super(w1Var);
        this.f18971d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f18972e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f18973f = h.a(classLoader);
    }
}
