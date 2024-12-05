package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
final class m3 implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private zzyd<?, ?> f15996f;

    /* renamed from: g, reason: collision with root package name */
    private Object f15997g;

    /* renamed from: h, reason: collision with root package name */
    private List<n3> f15998h = new ArrayList();

    private final byte[] b() throws IOException {
        byte[] bArr = new byte[d()];
        c(zzya.i(bArr));
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final m3 clone() {
        m3 m3Var = new m3();
        try {
            m3Var.f15996f = this.f15996f;
            List<n3> list = this.f15998h;
            if (list == null) {
                m3Var.f15998h = null;
            } else {
                m3Var.f15998h.addAll(list);
            }
            Object obj = this.f15997g;
            if (obj != null) {
                if (obj instanceof zzyi) {
                    m3Var.f15997g = (zzyi) ((zzyi) obj).clone();
                } else if (obj instanceof byte[]) {
                    m3Var.f15997g = ((byte[]) obj).clone();
                } else {
                    int i2 = 0;
                    if (obj instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) obj;
                        byte[][] bArr2 = new byte[bArr.length];
                        m3Var.f15997g = bArr2;
                        while (i2 < bArr.length) {
                            bArr2[i2] = (byte[]) bArr[i2].clone();
                            i2++;
                        }
                    } else if (obj instanceof boolean[]) {
                        m3Var.f15997g = ((boolean[]) obj).clone();
                    } else if (obj instanceof int[]) {
                        m3Var.f15997g = ((int[]) obj).clone();
                    } else if (obj instanceof long[]) {
                        m3Var.f15997g = ((long[]) obj).clone();
                    } else if (obj instanceof float[]) {
                        m3Var.f15997g = ((float[]) obj).clone();
                    } else if (obj instanceof double[]) {
                        m3Var.f15997g = ((double[]) obj).clone();
                    } else if (obj instanceof zzyi[]) {
                        zzyi[] zzyiVarArr = (zzyi[]) obj;
                        zzyi[] zzyiVarArr2 = new zzyi[zzyiVarArr.length];
                        m3Var.f15997g = zzyiVarArr2;
                        while (i2 < zzyiVarArr.length) {
                            zzyiVarArr2[i2] = (zzyi) zzyiVarArr[i2].clone();
                            i2++;
                        }
                    }
                }
            }
            return m3Var;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(zzya zzyaVar) throws IOException {
        Object obj = this.f15997g;
        if (obj != null) {
            zzyd<?, ?> zzydVar = this.f15996f;
            if (zzydVar.f16178d) {
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj2 = Array.get(obj, i2);
                    if (obj2 != null) {
                        zzydVar.a(obj2, zzyaVar);
                    }
                }
                return;
            }
            zzydVar.a(obj, zzyaVar);
            return;
        }
        for (n3 n3Var : this.f15998h) {
            zzyaVar.g(n3Var.a);
            zzyaVar.j(n3Var.f16001b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        Object obj = this.f15997g;
        if (obj != null) {
            zzyd<?, ?> zzydVar = this.f15996f;
            if (zzydVar.f16178d) {
                int length = Array.getLength(obj);
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    Object obj2 = Array.get(obj, i3);
                    if (obj2 != null) {
                        i2 += zzydVar.b(obj2);
                    }
                }
                return i2;
            }
            return zzydVar.b(obj);
        }
        int i4 = 0;
        for (n3 n3Var : this.f15998h) {
            i4 += zzya.d(n3Var.a) + 0 + n3Var.f16001b.length;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        List<n3> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        if (this.f15997g != null && m3Var.f15997g != null) {
            zzyd<?, ?> zzydVar = this.f15996f;
            if (zzydVar != m3Var.f15996f) {
                return false;
            }
            if (!zzydVar.f16176b.isArray()) {
                return this.f15997g.equals(m3Var.f15997g);
            }
            Object obj2 = this.f15997g;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) m3Var.f15997g);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) m3Var.f15997g);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) m3Var.f15997g);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) m3Var.f15997g);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) m3Var.f15997g);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) m3Var.f15997g);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) m3Var.f15997g);
        }
        List<n3> list2 = this.f15998h;
        if (list2 != null && (list = m3Var.f15998h) != null) {
            return list2.equals(list);
        }
        try {
            return Arrays.equals(b(), m3Var.b());
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
