package kotlin.reflect.x.internal.l0.j.b.f0;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.l;

/* compiled from: BuiltInsResourceLoader.kt */
/* loaded from: classes2.dex */
public final class d {
    public final InputStream a(String str) {
        l.f(str, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
