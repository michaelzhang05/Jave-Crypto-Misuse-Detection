package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class wx implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private zzdrs<?, ?> f12348f;

    /* renamed from: g, reason: collision with root package name */
    private Object f12349g;

    /* renamed from: h, reason: collision with root package name */
    private List<Object> f12350h = new ArrayList();

    private final byte[] b() throws IOException {
        byte[] bArr = new byte[e()];
        c(zzdrp.e(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final wx clone() {
        wx wxVar = new wx();
        try {
            wxVar.f12348f = this.f12348f;
            List<Object> list = this.f12350h;
            if (list == null) {
                wxVar.f12350h = null;
            } else {
                wxVar.f12350h.addAll(list);
            }
            Object obj = this.f12349g;
            if (obj != null) {
                if (obj instanceof zzdrw) {
                    wxVar.f12349g = (zzdrw) ((zzdrw) obj).clone();
                } else if (obj instanceof byte[]) {
                    wxVar.f12349g = ((byte[]) obj).clone();
                } else {
                    int i2 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        wxVar.f12349g = bArr2;
                        while (i2 < bArr.length) {
                            bArr2[i2] = (byte[]) bArr[i2].clone();
                            i2++;
                        }
                    } else if (obj instanceof boolean[]) {
                        wxVar.f12349g = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        wxVar.f12349g = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        wxVar.f12349g = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        wxVar.f12349g = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        wxVar.f12349g = ((double[]) obj).clone();
                    } else if (obj instanceof zzdrw[]) {
                        zzdrw[] zzdrwVarArr = (zzdrw[]) obj;
                        zzdrw[] zzdrwVarArr2 = new zzdrw[zzdrwVarArr.length];
                        wxVar.f12349g = zzdrwVarArr2;
                        while (i2 < zzdrwVarArr.length) {
                            zzdrwVarArr2[i2] = (zzdrw) zzdrwVarArr[i2].clone();
                            i2++;
                        }
                    }
                }
            }
            return wxVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(zzdrp zzdrpVar) throws IOException {
        if (this.f12349g == null) {
            Iterator<Object> it = this.f12350h.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        if (this.f12349g == null) {
            Iterator<Object> it = this.f12350h.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<Object> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wx)) {
            return false;
        }
        wx wxVar = (wx) obj;
        if (this.f12349g != null && wxVar.f12349g != null) {
            zzdrs<?, ?> zzdrsVar = this.f12348f;
            if (zzdrsVar != wxVar.f12348f) {
                return false;
            }
            if (!zzdrsVar.a.isArray()) {
                return this.f12349g.equals(wxVar.f12349g);
            }
            Object obj2 = this.f12349g;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) wxVar.f12349g);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) wxVar.f12349g);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) wxVar.f12349g);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) wxVar.f12349g);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) wxVar.f12349g);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) wxVar.f12349g);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) wxVar.f12349g);
        }
        List<Object> list2 = this.f12350h;
        if (list2 != null && (list = wxVar.f12350h) != null) {
            return list2.equals(list);
        }
        try {
            return Arrays.equals(b(), wxVar.b());
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(b()) + 527;
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
