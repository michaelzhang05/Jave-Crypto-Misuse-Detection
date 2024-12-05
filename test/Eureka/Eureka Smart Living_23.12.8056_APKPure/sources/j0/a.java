package j0;

import f5.f;
import f5.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0107a f7055a = new C0107a(null);

    /* renamed from: j0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0107a {
        private C0107a() {
        }

        public /* synthetic */ C0107a(f fVar) {
            this();
        }

        private final void a(c cVar, int i6, Object obj) {
            long j6;
            int byteValue;
            double doubleValue;
            if (obj == null) {
                cVar.b(i6);
                return;
            }
            if (obj instanceof byte[]) {
                cVar.x(i6, (byte[]) obj);
                return;
            }
            if (obj instanceof Float) {
                doubleValue = ((Number) obj).floatValue();
            } else {
                if (!(obj instanceof Double)) {
                    if (obj instanceof Long) {
                        j6 = ((Number) obj).longValue();
                    } else {
                        if (obj instanceof Integer) {
                            byteValue = ((Number) obj).intValue();
                        } else if (obj instanceof Short) {
                            byteValue = ((Number) obj).shortValue();
                        } else if (obj instanceof Byte) {
                            byteValue = ((Number) obj).byteValue();
                        } else {
                            if (obj instanceof String) {
                                cVar.p(i6, (String) obj);
                                return;
                            }
                            if (!(obj instanceof Boolean)) {
                                throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i6 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                            }
                            j6 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                        }
                        j6 = byteValue;
                    }
                    cVar.a(i6, j6);
                    return;
                }
                doubleValue = ((Number) obj).doubleValue();
            }
            cVar.c(i6, doubleValue);
        }

        public final void b(c cVar, Object[] objArr) {
            h.e(cVar, "statement");
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i6 = 0;
            while (i6 < length) {
                Object obj = objArr[i6];
                i6++;
                a(cVar, i6, obj);
            }
        }
    }

    public static final void a(c cVar, Object[] objArr) {
        f7055a.b(cVar, objArr);
    }
}
