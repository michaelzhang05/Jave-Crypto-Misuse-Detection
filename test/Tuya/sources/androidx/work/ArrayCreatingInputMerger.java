package androidx.work;

import androidx.work.Data;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ArrayCreatingInputMerger extends InputMerger {
    private final Object concatenateArrayAndNonArray(Object obj, Object obj2, Class<?> cls) {
        int length = Array.getLength(obj);
        Object newArray = Array.newInstance(cls, length + 1);
        System.arraycopy(obj, 0, newArray, 0, length);
        Array.set(newArray, length, obj2);
        AbstractC3159y.h(newArray, "newArray");
        return newArray;
    }

    private final Object concatenateArrays(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        int length2 = Array.getLength(obj2);
        Class<?> componentType = obj.getClass().getComponentType();
        AbstractC3159y.f(componentType);
        Object newArray = Array.newInstance(componentType, length + length2);
        System.arraycopy(obj, 0, newArray, 0, length);
        System.arraycopy(obj2, 0, newArray, length, length2);
        AbstractC3159y.h(newArray, "newArray");
        return newArray;
    }

    private final Object createArrayFor(Object obj, Class<?> cls) {
        Object newArray = Array.newInstance(cls, 1);
        Array.set(newArray, 0, obj);
        AbstractC3159y.h(newArray, "newArray");
        return newArray;
    }

    @Override // androidx.work.InputMerger
    public Data merge(List<Data> inputs) {
        Class<?> cls;
        AbstractC3159y.i(inputs, "inputs");
        Data.Builder builder = new Data.Builder();
        HashMap hashMap = new HashMap();
        Iterator<Data> it = inputs.iterator();
        while (it.hasNext()) {
            Map<String, Object> keyValueMap = it.next().getKeyValueMap();
            AbstractC3159y.h(keyValueMap, "input.keyValueMap");
            for (Map.Entry<String, Object> entry : keyValueMap.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    cls = value.getClass();
                } else {
                    cls = String.class;
                }
                Object obj = hashMap.get(key);
                AbstractC3159y.h(key, "key");
                if (obj == null) {
                    if (!cls.isArray()) {
                        value = createArrayFor(value, cls);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (AbstractC3159y.d(cls2, cls)) {
                        AbstractC3159y.h(value, "value");
                        value = concatenateArrays(obj, value);
                    } else if (AbstractC3159y.d(cls2.getComponentType(), cls)) {
                        value = concatenateArrayAndNonArray(obj, value, cls);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                AbstractC3159y.h(value, "if (existingValue == nul…      }\n                }");
                hashMap.put(key, value);
            }
        }
        builder.putAll(hashMap);
        Data build = builder.build();
        AbstractC3159y.h(build, "output.build()");
        return build;
    }
}
