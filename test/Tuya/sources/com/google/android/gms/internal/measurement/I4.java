package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class I4 extends M4 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f15352c = DesugarCollections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ I4(H4 h42) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.M4
    public final void a(Object obj, long j8) {
        Object unmodifiableList;
        List list = (List) AbstractC2153z5.k(obj, j8);
        if (list instanceof G4) {
            unmodifiableList = ((G4) list).e();
        } else {
            if (f15352c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof InterfaceC1992f5) && (list instanceof A4)) {
                A4 a42 = (A4) list;
                if (a42.c()) {
                    a42.b();
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        AbstractC2153z5.x(obj, j8, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.M4
    public final void b(Object obj, Object obj2, long j8) {
        F4 f42;
        List list = (List) AbstractC2153z5.k(obj2, j8);
        int size = list.size();
        List list2 = (List) AbstractC2153z5.k(obj, j8);
        if (list2.isEmpty()) {
            if (list2 instanceof G4) {
                list2 = new F4(size);
            } else if ((list2 instanceof InterfaceC1992f5) && (list2 instanceof A4)) {
                list2 = ((A4) list2).k(size);
            } else {
                list2 = new ArrayList(size);
            }
            AbstractC2153z5.x(obj, j8, list2);
        } else {
            if (f15352c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                AbstractC2153z5.x(obj, j8, arrayList);
                f42 = arrayList;
            } else if (list2 instanceof C2113u5) {
                F4 f43 = new F4(list2.size() + size);
                f43.addAll(f43.size(), (C2113u5) list2);
                AbstractC2153z5.x(obj, j8, f43);
                f42 = f43;
            } else if ((list2 instanceof InterfaceC1992f5) && (list2 instanceof A4)) {
                A4 a42 = (A4) list2;
                if (!a42.c()) {
                    list2 = a42.k(list2.size() + size);
                    AbstractC2153z5.x(obj, j8, list2);
                }
            }
            list2 = f42;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        AbstractC2153z5.x(obj, j8, list);
    }
}
