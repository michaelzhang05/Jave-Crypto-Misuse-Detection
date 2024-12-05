package com.getcapacitor.community.database.sqlite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static g f4342b;

    /* renamed from: a, reason: collision with root package name */
    private HashMap f4343a = new HashMap();

    private g() {
    }

    public static synchronized g b() {
        g gVar;
        synchronized (g.class) {
            if (f4342b == null) {
                f4342b = new g();
            }
            gVar = f4342b;
        }
        return gVar;
    }

    public synchronized void a(String str, f fVar) {
        ArrayList arrayList = (ArrayList) this.f4343a.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f4343a.put(str, arrayList);
        }
        arrayList.add(fVar);
    }

    public synchronized void c(String str, Map map) {
        ArrayList arrayList = (ArrayList) this.f4343a.get(str);
        if (arrayList != null) {
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                fVar.b(map);
                fVar.run();
            }
        }
    }
}
