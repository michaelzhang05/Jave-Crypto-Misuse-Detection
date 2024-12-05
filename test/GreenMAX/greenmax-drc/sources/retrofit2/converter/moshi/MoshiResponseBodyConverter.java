package retrofit2.converter.moshi;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.f;
import com.squareup.moshi.i;
import j.h;
import j.i;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

/* loaded from: classes2.dex */
final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final i UTF8_BOM = i.i("EFBBBF");
    private final f<T> adapter;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MoshiResponseBodyConverter(f<T> fVar) {
        this.adapter = fVar;
    }

    @Override // retrofit2.Converter
    public T convert(ResponseBody responseBody) throws IOException {
        h bodySource = responseBody.getBodySource();
        try {
            if (bodySource.Q(0L, UTF8_BOM)) {
                bodySource.skip(r3.P());
            }
            com.squareup.moshi.i g0 = com.squareup.moshi.i.g0(bodySource);
            T fromJson = this.adapter.fromJson(g0);
            if (g0.i0() == i.b.END_DOCUMENT) {
                return fromJson;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
