package org.naemansan.tagapi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

@Builder
public record TagDto(
        @JsonProperty("id")
        Long id,

        @JsonProperty("name")
        String name
) {
}
