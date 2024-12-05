package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.p4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2073p4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f15837a = Logger.getLogger(AbstractC1991f4.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final String f15838b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2025j4 a(Class cls) {
        String str;
        ClassLoader classLoader = AbstractC2073p4.class.getClassLoader();
        if (!cls.equals(C2025j4.class)) {
            if (!cls.getPackage().equals(AbstractC2073p4.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            str = f15838b;
        }
        try {
            try {
                try {
                    try {
                        android.support.v4.media.a.a(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (InstantiationException e8) {
                        throw new IllegalStateException(e8);
                    }
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(e9);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC2073p4.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    android.support.v4.media.a.a(it.next());
                    throw null;
                } catch (ServiceConfigurationError e12) {
                    f15837a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (C2025j4) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2025j4) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }
}
