// Generated by Dagger (https://dagger.dev).
package com.example.android.dagger.storage;

import android.content.Context;

import com.example.storage.SharedPreferencesStorage;

import javax.inject.Provider;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPreferencesStorage_Factory implements Factory<SharedPreferencesStorage> {
  private final Provider<Context> contextProvider;

  public SharedPreferencesStorage_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferencesStorage get() {
    return newInstance(contextProvider.get());
  }

  public static SharedPreferencesStorage_Factory create(Provider<Context> contextProvider) {
    return new SharedPreferencesStorage_Factory(contextProvider);
  }

  public static SharedPreferencesStorage newInstance(Context context) {
    return new SharedPreferencesStorage(context);
  }
}
