package com.pawfectly.common.functions.auditable.service.impl;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // change into current auth login.
        // Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = "test-admin@gmail.com";
        return name.describeConstable();
    }
}
