package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class FilteredBeanPropertyWriter {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class MultiView extends BeanPropertyWriter implements Serializable {
        protected final BeanPropertyWriter _delegate;
        protected final Class<?>[] _views;

        protected MultiView(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._views = clsArr;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignNullSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView != null) {
                int i2 = 0;
                int length = this._views.length;
                while (i2 < length && !this._views[i2].isAssignableFrom(activeView)) {
                    i2++;
                }
                if (i2 == length) {
                    this._delegate.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
                    return;
                }
            }
            this._delegate.serializeAsElement(obj, jsonGenerator, serializerProvider);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView != null) {
                int i2 = 0;
                int length = this._views.length;
                while (i2 < length && !this._views[i2].isAssignableFrom(activeView)) {
                    i2++;
                }
                if (i2 == length) {
                    this._delegate.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
                    return;
                }
            }
            this._delegate.serializeAsField(obj, jsonGenerator, serializerProvider);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public MultiView rename(NameTransformer nameTransformer) {
            return new MultiView(this._delegate.rename(nameTransformer), this._views);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class SingleView extends BeanPropertyWriter implements Serializable {
        protected final BeanPropertyWriter _delegate;
        protected final Class<?> _view;

        protected SingleView(BeanPropertyWriter beanPropertyWriter, Class<?> cls) {
            super(beanPropertyWriter);
            this._delegate = beanPropertyWriter;
            this._view = cls;
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignNullSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignNullSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void assignSerializer(JsonSerializer<Object> jsonSerializer) {
            this._delegate.assignSerializer(jsonSerializer);
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView != null && !this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsPlaceholder(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsElement(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws Exception {
            Class<?> activeView = serializerProvider.getActiveView();
            if (activeView != null && !this._view.isAssignableFrom(activeView)) {
                this._delegate.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
            } else {
                this._delegate.serializeAsField(obj, jsonGenerator, serializerProvider);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.BeanPropertyWriter
        public SingleView rename(NameTransformer nameTransformer) {
            return new SingleView(this._delegate.rename(nameTransformer), this._view);
        }
    }

    public static BeanPropertyWriter constructViewBased(BeanPropertyWriter beanPropertyWriter, Class<?>[] clsArr) {
        if (clsArr.length == 1) {
            return new SingleView(beanPropertyWriter, clsArr[0]);
        }
        return new MultiView(beanPropertyWriter, clsArr);
    }
}
