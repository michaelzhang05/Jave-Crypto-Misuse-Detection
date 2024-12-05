package S1;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap f8951a = new ConcurrentHashMap();

    public static d a(Class cls, j jVar) {
        String concat;
        Class cls2;
        android.support.v4.media.a.a(f8951a.get(cls));
        b[] b8 = a.b(cls, jVar);
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            concat = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            concat = name.concat("AccAccess");
        }
        i iVar = new i(cls.getClassLoader());
        try {
            cls2 = iVar.loadClass(concat);
        } catch (ClassNotFoundException unused) {
            cls2 = null;
        }
        LinkedList b9 = b(cls);
        if (cls2 == null) {
            e eVar = new e(cls, b8, iVar);
            Iterator it = b9.iterator();
            while (it.hasNext()) {
                eVar.b((Iterable) f.f8962a.get((Class) it.next()));
            }
            cls2 = eVar.c();
        }
        try {
            android.support.v4.media.a.a(cls2.newInstance());
            throw null;
        } catch (Exception e8) {
            throw new RuntimeException("Error constructing accessor class: " + concat, e8);
        }
    }

    private static LinkedList b(Class cls) {
        LinkedList linkedList = new LinkedList();
        while (cls != null && !cls.equals(Object.class)) {
            linkedList.addLast(cls);
            for (Class<?> cls2 : cls.getInterfaces()) {
                linkedList.addLast(cls2);
            }
            cls = cls.getSuperclass();
        }
        linkedList.addLast(Object.class);
        return linkedList;
    }
}
