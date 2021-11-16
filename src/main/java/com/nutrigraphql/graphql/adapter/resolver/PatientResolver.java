package com.nutrigraphql.graphql.adapter.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.nutrigraphql.graphql.entity.Patient;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class PatientResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    public Collection<Patient> findAllPatient(){
        return Collections.emptyList();
    }

}
