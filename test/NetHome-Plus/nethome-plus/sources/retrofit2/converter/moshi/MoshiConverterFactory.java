package retrofit2.converter.moshi;

import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* loaded from: classes2.dex */
public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final r moshi;
    private final boolean serializeNulls;

    private MoshiConverterFactory(r rVar, boolean z, boolean z2, boolean z3) {
        this.moshi = rVar;
        this.lenient = z;
        this.failOnUnknown = z2;
        this.serializeNulls = z3;
    }

    public static MoshiConverterFactory create() {
        return create(new r.a().b());
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        f e2 = this.moshi.e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            e2 = e2.lenient();
        }
        if (this.failOnUnknown) {
            e2 = e2.failOnUnknown();
        }
        if (this.serializeNulls) {
            e2 = e2.serializeNulls();
        }
        return new MoshiRequestBodyConverter(e2);
    }

    @Override // retrofit2.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        f e2 = this.moshi.e(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            e2 = e2.lenient();
        }
        if (this.failOnUnknown) {
            e2 = e2.failOnUnknown();
        }
        if (this.serializeNulls) {
            e2 = e2.serializeNulls();
        }
        return new MoshiResponseBodyConverter(e2);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public static MoshiConverterFactory create(r rVar) {
        if (rVar != null) {
            return new MoshiConverterFactory(rVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }
}
