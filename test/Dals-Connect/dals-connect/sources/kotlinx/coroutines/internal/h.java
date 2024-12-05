package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* compiled from: FastServiceLoader.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final h a = new h();

    private h() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> y0;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            y0 = kotlin.collections.b0.y0(ServiceLoader.load(cls, classLoader));
            return y0;
        }
    }

    private final List<String> e(URL url) {
        boolean A;
        BufferedReader bufferedReader;
        String A0;
        String F0;
        String A02;
        String url2 = url.toString();
        A = kotlin.text.u.A(url2, "jar", false, 2, null);
        if (A) {
            A0 = kotlin.text.v.A0(url2, "jar:file:", null, 2, null);
            F0 = kotlin.text.v.F0(A0, '!', null, 2, null);
            A02 = kotlin.text.v.A0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(F0, false);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(A02)), "UTF-8"));
                try {
                    List<String> f2 = a.f(bufferedReader);
                    kotlin.io.a.a(bufferedReader, null);
                    jarFile.close();
                    return f2;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.b.a(th, th3);
                        throw th;
                    }
                }
            }
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> f3 = a.f(bufferedReader);
                kotlin.io.a.a(bufferedReader, null);
                return f3;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } finally {
                }
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> y0;
        String G0;
        CharSequence I0;
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                y0 = kotlin.collections.b0.y0(linkedHashSet);
                return y0;
            }
            G0 = kotlin.text.v.G0(readLine, "#", null, 2, null);
            if (G0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            I0 = kotlin.text.v.I0(G0);
            String obj = I0.toString();
            int i2 = 0;
            while (true) {
                if (i2 >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i2);
                if (!(charAt == '.' || Character.isJavaIdentifierPart(charAt))) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(kotlin.jvm.internal.l.m("Illegal service provider class name: ", obj).toString());
            }
        }
    }

    public final List<MainDispatcherFactory> c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!i.a()) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set C0;
        int t;
        ArrayList list = Collections.list(classLoader.getResources(kotlin.jvm.internal.l.m("META-INF/services/", cls.getName())));
        kotlin.jvm.internal.l.e(list, "java.util.Collections.list(this)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.y.y(arrayList, a.e((URL) it.next()));
        }
        C0 = kotlin.collections.b0.C0(arrayList);
        if (!C0.isEmpty()) {
            t = kotlin.collections.u.t(C0, 10);
            ArrayList arrayList2 = new ArrayList(t);
            Iterator it2 = C0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a.a((String) it2.next(), classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}
